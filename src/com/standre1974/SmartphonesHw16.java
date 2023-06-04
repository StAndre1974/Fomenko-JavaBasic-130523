package com.standre1974;

/*
Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
Зробіть класи, які його імплементують: Androids, iPhones.
Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
Створіть екземпляри кожного виду у мейн-класі
 */

public interface SmartphonesHw16 {
    void call();
    void sms();
    void internet();
}

class Androids implements SmartphonesHw16{

    @Override
    public void call() {

    }

    @Override
    public void sms() {

    }

    @Override
    public void internet() {

    }
}


class IPhones implements SmartphonesHw16{

    @Override
    public void call() {

    }

    @Override
    public void sms() {

    }

    @Override
    public void internet() {

    }
}
