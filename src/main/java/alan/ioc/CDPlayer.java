package alan.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    private Modern cd;
    @Autowired
    public void setCd(Modern m){
        this.cd=m;
    }
    public  void play(){
        cd.info();
    }
}
