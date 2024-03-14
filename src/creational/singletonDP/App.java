package creational.singletonDP;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern");
        Singleton.getInstance().addUser(
                "1",addUser(
                        "user1",
                        "pass1",
                        "first1",
                        "last1",
                        new HashMap<>()
                )
        );

        Singleton.getInstance().addUser(
                "2",addUser(
                        "user2",
                        "pass2",
                        "first2",
                        "last2",
                        new HashMap<>()
                )
        );

        Singleton.getInstance().addUser(
                "3",addUser(
                        "user3",
                        "pass3",
                        "first3",
                        "last3",
                        new HashMap<>()
                )
        );


        Singleton.getInstance().logAllUsers();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton.getInstance().addUser(
                        "4",addUser(
                                "user4",
                                "pass4",
                                "first4",
                                "last4",
                                new HashMap<>()
                        )
                );
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton.getInstance().addUser(
                        "5",addUser(
                                "user5",
                                "pass5",
                                "first5",
                                "last5",
                                new HashMap<>()
                        )
                );
            }
        });

        Singleton.getInstance().removeAllUsers();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("--------------------");

        Singleton.getInstance().logAllUsers();

    }

    private static Map<String, Object>
    addUser(
           String userName,
           String password,
           String firstName,
           String lastName,
           Map<String, Object> userMap
    ) {
            userMap.put("userName", userName);
            userMap.put("password", password);
            userMap.put("firstName", firstName);
            userMap.put("lastName", lastName);

            return userMap;
    }
}
