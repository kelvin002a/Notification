package com.example.notifier;
// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class notificationSystem {



        // Find your Account Sid and Auth Token at twilio.com/console
        public static final String ACCOUNT_SID =
                "ACe0e4ea5f564c553c384ea5edca55858b";
        public static final String AUTH_TOKEN =
                "580a8ffe9c427df6f94f311c47e389ca";
public  String phoneOne;
public String phoneTwo;
        public notificationSystem(String phoneOne , String phoneTwo) {

            this.phoneOne = phoneOne;
            this.phoneTwo = phoneTwo;

        }
        public  boolean sendMessage(String messageBody){
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

            Message message = Message
                    .creator(new PhoneNumber(phoneOne), // to
                            new PhoneNumber(phoneTwo), // from
                            messageBody)
                    .create();

            System.out.println(message.getSid());
            return  true;
        }

}

