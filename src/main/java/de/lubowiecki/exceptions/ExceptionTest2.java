package de.lubowiecki.exceptions;

public class ExceptionTest2 {

    public static void main(String[] args) {

        try {
            machWas(-10);
        }
        catch(ZuWenigException ex) {
            System.out.println("Zu wenig: " + ex.getMessage());
        }
        catch(ZuVielException ex) {
            System.out.println("Zu viel: " + ex.getMessage());
        }
        catch(RuntimeException ex) {
            System.out.println("Anderes Laufzeit-Problem");
            //ex.printStackTrace();
        }
        catch(Exception ex) {
            System.out.println("Anderes Problem");
            //ex.printStackTrace();
        }

    }

    static void machWas(int i) {

        if(i < 0) {
            throw new ZuWenigException("Du bist zu jung"); // Werfen einer eigenen Exception
        }
        else if(i > 200) {
            throw new ZuVielException("Du bist zu alt");
        }

        System.out.println("Ok!");
    }

    void machWasANderes() {

    }
}

class ZuWenigException extends RuntimeException {

    public ZuWenigException(String message) {
        super(message);
    }
}

class ZuVielException extends RuntimeException {

    public ZuVielException(String message) {
        super(message);
    }
}
