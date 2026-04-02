package Creationale.SingletonRegistry.ex2.clase;

public class CameraSupraveghere implements IDispozitiv{
    @Override
    public void actioneaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camera de supraveghere este activa.");
        System.out.println(sb.toString());
    }
}
