public class BmiService {
    public float calculate(float height, float weight) {
        //      float bml = weight / (height * height);

        float bml = (float) ((float) weight / Math.pow(height, 2));
        return bml;
    }
}
