package bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import encrypt.Encrypt;

public class EncryptWithDependency {

 private Encrypt encrypt;

    @Autowired
    public void setEncrypt (Encrypt pEncrypter){
        this.encrypt = pEncrypter;
    }
    public void run(){
        //letra para encriptar
        String toEncrypt = "Word to encrypt";
        encrypt.encrypt(toEncrypt);
    }

}
