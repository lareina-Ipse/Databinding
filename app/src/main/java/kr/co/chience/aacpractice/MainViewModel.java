package kr.co.chience.aacpractice;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<User> user = new MutableLiveData<>();

    public MutableLiveData<User> getUser() {
        setUser();
        return user;
    }

    public void setUser() {
        User user = new User();
        user.name = "Haerul";
        user.email = "Haerul@gmail.com";
        this.user.setValue(user);
    }

    public void updateUser() {
        User user = new User();
        user.name = "Test Update";
        user.email = "Test@gmail.com";
        this.user.setValue(user);
    }

}
