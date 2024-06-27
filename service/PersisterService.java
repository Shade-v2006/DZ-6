package DZ.DZ_6.service;

import DZ.DZ_6.model.Persister;
import DZ.DZ_6.model.User;

public class PersisterService {
    
    Persister pr;

    public Persister createPersister(User user){
        this.pr = new Persister(user);
        return pr;
    }

    public void save(){
        System.out.println("Save user: " + pr.getUser().getName());
    }

}

