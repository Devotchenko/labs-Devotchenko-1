package moving;

public class OnHorse implements Moving {
    @Override
    public void move(String move) {
        System.out.printf("%s герой едет на лошади%n", move);
    }
}