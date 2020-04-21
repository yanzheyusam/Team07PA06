import java.util.ArrayList;

/**
 *Sample is a list of doubles
 *
 */

public class Sample {
	ArrayList<Double> sample;
	private int cluster_id;

	public Sample(double[] number) {
		this.sample = new ArrayList<Double>();
		for (int i = 0; i < values.length; i++) {
			sample.add(number[i]);
		}
	}

	public Sample(double x, double y) {
		this.sample = new ArrayList<Double>();
		sample.add(x);
		sample.add(y);
	}

  //the following are some getters and setters of sample
	public double getX() {
		return sample.get(0);
	}

  public void setX(double x) {
    sample.set(0, x);
  }

	public double getY() {
		return sample.get(1);
	}

	public void setY(double y) {
		sample.set(1, y);
	}

	public void set_Clusters(int n) {
		this.cluster_id = n;
	}

//the distance method can find the distance between two samples
	public double Distance(Sample s) {
		double result = 0;
		for (int i = 0; i < s.sample.size(); i++) {
			double difference = (double) Math.round((this.sample.get(i) - s.sample.get(i)) * 100d) / 100d;
			result += Math.pow(difference, 2);
		}
		return Math.sqrt(result);
	}

	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}

	/**
	 * this method can get the shortest distance
	 */
	public Sample get_shortest(ArrayList<Sample> s) {
		int i = 0;
		Sample shortest = s.get(0);
		double distance = this.Distance(s.get(0));

		while (i < s.size()) {
			double result = this.Distance(s.get(i));
			if (result < distance) {
				distance = result;
				shortest = s.get(i);
			}
			i++;
		}
		return shortest;
	}

}
