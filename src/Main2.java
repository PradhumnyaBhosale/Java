class Door{

    boolean isOpen;
    // method to open door
    void Open() {
        isOpen = true;
        System.out.println("Door Is open "+isOpen);

    }
    void Close(){
        isOpen=false;
        System.out.println("Door is closed "+isOpen);
    }
}

class Main2 {
    public static void main(String[] args) {

        // creating  objects for Door
        Door front = new Door();
        Door back = new Door();

        // opening Door
        // Calling Open()
        front.Open();

        // Closing Door
        // calling method Close()
        back.Close();
    }
}
