public class SlidingWindowDriver {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};

        SlidingWindow slide = new SlidingWindow();
        System.out.println(slide.findMaxTotal(arr, 2));
    }
}
