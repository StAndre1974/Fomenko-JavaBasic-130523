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

        LinuxOS[] phoneLinux = new LinuxOS[countPhones];
        phoneLinux[0] = samsung1;

        IOS[] phoneIOS = new IOS[countPhones];
        phoneIOS[0] = iPhone1;
        phoneIOS[1] = iPhone2;


        for (Smartphones phone : phones) {
            phone.call();
            phone.sms();
            phone.sms();
            if (phone instanceof Androids) {
                ((Androids) phone).operationSystem();
            } else {
                ((IPhones) phone).operationSystem();
            }
            System.out.print("\n");
        }

    }
}

    interface Smartphones {
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
        public void call() {
            System.out.println(PHONE_TYPE + " " + phoneName + " can call");
        }

        @Override
        public void sms() {
            System.out.println(PHONE_TYPE + " " + phoneName + " can receive and send SMS");
        }

        @Override
        public void internet() {
            System.out.println(PHONE_TYPE + " " + phoneName + " has mobile internet");
        }

        @Override
        public void operationSystem() {
            System.out.println(PHONE_TYPE + " " + phoneName + " has operation system Android");
        }
    }


    class IPhones implements Smartphones, IOS {
        private final static String PHONE_TYPE = "Phone iOs";
        private String phoneName;

        public IPhones(String phoneName) {
            this.phoneName = phoneName;
        }

        @Override
        public void call() {
            System.out.println(PHONE_TYPE + " " + phoneName + " can call");
        }

        @Override
        public void sms() {
            System.out.println(PHONE_TYPE + " " + phoneName + " can receive and send SMS");
        }

        @Override
        public void internet() {
            System.out.println(PHONE_TYPE + " " + phoneName + " has mobile internet");
        }

        @Override
        public void operationSystem() {
            System.out.println(PHONE_TYPE + " " + phoneName + " has operation system iOs");
        }
    }

