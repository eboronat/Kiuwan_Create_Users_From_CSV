package eb.kiuwan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.UserApi;
import io.swagger.client.auth.HttpBasicAuth;
import io.swagger.client.model.AccessControlConfigurationData;
import io.swagger.client.model.BusinessValuePortfolioRoleData;
import io.swagger.client.model.BusinessValuePortfolioRoleData.TypeEnum;
import io.swagger.client.model.UserManagementRequest;

public class CsvToKiuwan {

	private final static String[] PORTFOLIO_VALUES = {"CRITICAL", "HIGH", "MEDIUM", "LOW", "VERY LOW"};

    public static void main(String[] args) throws IOException, ApiException {
    	
    	if (args.length != 3) {
			System.out.println("Program receives 3 arguments: username password csvFile");
			return;
		}
    	
    	BufferedReader br = new BufferedReader(new FileReader(args[2]));
		Iterator<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(br).iterator();

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername(args[0]);
        basicAuth.setPassword(args[1]);

		// Instance API operation
		UserApi userApi = new UserApi(defaultClient);
		
		while (records.hasNext()) {
			CSVRecord record = records.next();
			UserManagementRequest body = new UserManagementRequest();

			System.out.println("Username: " + record.get("Username"));
			body.setUsername(record.get("Username"));

			System.out.println("Email: "+record.get("Email"));
			body.setEmail(record.get("Email"));

			System.out.println("First Name: "+record.get("Name"));
			body.setFirstName(record.get("Name"));

			System.out.println("Surname: "+record.get("Lastname"));
			body.setLastName(record.get("Lastname"));

			AccessControlConfigurationData accessControlConfiguration = new AccessControlConfigurationData();
			
			List<BusinessValuePortfolioRoleData> portfolio = new ArrayList<BusinessValuePortfolioRoleData>();
			System.out.println("Role: "+record.get("Role"));

			for (int i = 0; i < PORTFOLIO_VALUES.length; i++) {
				BusinessValuePortfolioRoleData p = new BusinessValuePortfolioRoleData();
				p.setPortfolioValue(PORTFOLIO_VALUES[i]);
				p.setRoleName(record.get("Role"));
				p.setType(TypeEnum.SYSTEM);
				portfolio.add(p);
			}
			
			accessControlConfiguration.setBusinessValueRoles(portfolio);

			body.setAccessControlConfiguration(accessControlConfiguration);
			body.setEnabled(true);
			body.setGeneratePassword(true);
						
	        userApi.createUser(body);
	        System.out.println("OK");
		}
    }
}