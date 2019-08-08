package alan.ioc;

import org.springframework.stereotype.Component;

@Component
public class Modern {
    private String title="Tomorrow";
    private String artist="vae";
//    public Modern(){
//        this.title="today";
//        this.artist="li";
//    }
    public void info(){
        System.out.println(title+" "+artist);
    }

//    @Override
//    public String toString() {
//        return title+artist;
//    }
}
