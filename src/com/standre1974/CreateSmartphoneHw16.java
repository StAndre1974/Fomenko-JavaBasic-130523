package com.standre1974;

public class CreateSmartphoneHw16 {

    public static void main(String[] args) {
        int countPhones = 3;

        Smartphones[] phones = new Smartphones[countPhones];
        Androids samsung1 = new Androids("Samsung1");
        IPhones iPhone1 = new IPhones("iPhone1");
        IPhones iPhone2 = new IPhones("iPhone2");

        phones[0] = samsung1;
        phones[1] = iPhone1;
        phones[2] = iPhone2;

        for (Smartphones phone : phones) {
            if (phone instanceof Androids) {
                phone.phoneName();
                ((Androids) phone).operationSystem();
            } else {
                phone.phoneName();
                ((IPhones) phone).operationSystem();
            }
            phone.call();
            phone.sms();
            phone.internet();
            System.out.print("\n");
        }

    }

}

interface Smartphones {
    void phoneName();

    void call();

    void sms();

    void internet();
}

interface LinuxOS {
    void operationSystem();
}

interface IOS {
    void operationSystem();
}

class Androids implements Smartphones, LinuxOS {
    private final static String PHONE_TYPE = "Phone Android";
    private final String phoneName;

    public Androids(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public void phoneName() {
        System.out.println(PHONE_TYPE + " model " + phoneName);
    }

    @Override
    public void call() {
        System.out.print("- can call\n");
    }

    @Override
    public void sms() {
        System.out.print("- can receive and send SMS\n");
    }

    @Override
    public void internet() {
        System.out.print("- has mobile internet\n");
    }

    @Override
    public void operationSystem() {
        System.out.print("- has operation system LinuxOS\n");
    }
}


class IPhones implements Smartphones, IOS {
    private final static String PHONE_TYPE = "Phone iOs";
    private final String phoneName;

    public IPhones(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public void phoneName() {
        System.out.println(PHONE_TYPE + " model " + phoneName);
    }

    @Override
    public void call() {
        System.out.print("- an call\n");
    }

    @Override
    public void sms() {
        System.out.print("- can receive and send SMS\n");
    }

    @Override
    public void internet() {
        System.out.print("- has mobile internet\n");
    }

    @Override
    public void operationSystem() {
        System.out.print("- has operation system iOs\n");
    }

}

