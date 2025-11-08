package inf319.daisy;

public class Daisy {

    private DaisyState state = DaisyState.off;

    public DaisyState getState() {
        return state;
    }

    public void pull() {
        switch (state) {
            case off:
                state = DaisyState.lowSpeed;
                break;
            case lowSpeed:
                state = DaisyState.medSpeed;
                break;
            case medSpeed:
                state = DaisyState.higSpeed;
                break;
            case higSpeed:
                state = DaisyState.off;
                break;
        }
    }
}
