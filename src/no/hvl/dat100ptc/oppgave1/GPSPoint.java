package no.hvl.dat100ptc.oppgave1;

import no.hvl.dat100ptc.TODO;

public class GPSPoint {

	// TODO - objektvariable
	// dobbeltsjekk variabeltypene -lyslo
	private int time;
	private double latitude;
	private double longitude;
	private double elevation;

	// TODO - konstruktur
	public GPSPoint(int time, double latitude, double longitude, double elevation) {
		time = 0;
		latitude = 0;
		longitude = 0;
		elevation = 0;
	}

	// TODO - get/set metoder
	public int getTime() {

		return time;

	}

	public void setTime(int time) {

		this.time = time;

	}

	public double getLatitude() {

		return latitude;

	}

	public void setLatitude(double latitude) {

		this.latitude = latitude;

	}

	public double getLongitude() {

		return longitude;

	}

	public void setLongitude(double longitude) {

		this.longitude = longitude;

	}

	public double getElevation() {

		return elevation;

	}

	public void setElevation(double elevation) {

		this.elevation = elevation;

	}

	public String toString() {

		String str;

		// TODO - start

		throw new UnsupportedOperationException(TODO.method());

		// TODO - slutt

	}
}
