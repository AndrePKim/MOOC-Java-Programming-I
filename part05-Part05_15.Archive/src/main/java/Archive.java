
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kim
 */
public class Archive {
    private String code;
    private String name;
    
    public Archive(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedArchive = (Archive) compared;
        
        if (this.code.equals(comparedArchive.getCode())) {
            return true;
        }

        return false;

    }
    
    @Override
    public String toString() {
        return this.code + ": " + this.name;
    }
    
}
