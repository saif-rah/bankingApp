package com.banking.server;

import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;

import java.util.ArrayList;
import java.util.List;

public class BankingDemoClient {
    private static int port = 8080;
    private static String host = "localhost";
    private static String uri = "banking/customer";

    public static void main(String[] args) {

        try {
            // create HTTP client
            THttpClient httpClient = new THttpClient("http://" + host + ":" + port + "/" + uri);
            httpClient.setConnectTimeout(3000);
            TProtocol protocol = new TJSONProtocol(httpClient);

//            TAuthService.Client authClient = new TAuthService.Client(protocol);
//            TAdminService.Client adminClient = new TAdminService.Client(protocol);
//            TManagerService.Client managerClient = new TManagerService.Client(protocol);
            TCustomerService.Client customerClient = new TCustomerService.Client(protocol);

            String username = "saifur";
            String password = "abc";
            String branchCode = "0001";
            List<TTransaction> transactions = new ArrayList<TTransaction>();
            TCustomer customer = new TCustomer(username, password, branchCode, transactions);
            System.out.println("Creating Account");
            customerClient.addAccountRequest(customer);

            System.out.println(customer.getUsername() + " Created!");

//            if(client.createAccount(username, password)) System.out.println("TRUE");
//            else System.out.println("FALSE");
            // close transport
            httpClient.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}