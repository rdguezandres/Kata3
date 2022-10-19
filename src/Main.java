public class Main {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("usc.es");
        histogram.increment("usc.es");
        histogram.increment("usc.es");
        histogram.increment("usc.es");
        histogram.increment("usc.es");
        histogram.increment("usc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");

        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}