public class BmiService {
    public float calculate(float height, float weight) {
        float bml = weight / (height * height);
        return bml;
    }
}
