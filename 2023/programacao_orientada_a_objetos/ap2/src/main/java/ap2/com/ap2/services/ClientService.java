package ap2.com.ap2.services;

import ap2.com.ap2.model.UserModel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    private ArrayList<UserModel> userList;
    public UserModel getAll(String name){
        for (int i = 0; i < this.userList.size(); i++){
            if(name.isEmpty()){
                if(this.userList.get(i).name() == name){
                    return this.userList.get(i);
                }
            }else return userList;
        }
        return null;
    }
}
