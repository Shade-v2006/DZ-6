package DZ.DZ_6.view;

import java.util.Scanner;
// import DZ.DZ_6.model.User;
import DZ.DZ_6.service.PersisterService;
import DZ.DZ_6.service.UserService;

public class UserView {
    public void Start(){
        UserService us = new UserService();
        PersisterService ps = new PersisterService();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите имя: ");
        ps.createPersister(us.createUser(scanner1.nextLine()));
        us.report();
        ps.save();
        // System.out.println(scanner1);
    }
}
