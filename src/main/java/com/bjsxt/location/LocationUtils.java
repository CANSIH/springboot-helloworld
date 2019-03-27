package com.bjsxt.location;

/**
 * 功能：根据经纬度计算两地距离
 *
 * @author hecg
 * @version 2018年10月22日 下午8:25:50
 */
public class LocationUtils {

	private LocationUtils() {
	}

	private static double EARTH_RADIUS = 6378.137;

	private static double rad(double d) {
		return d * Math.PI / 180.0;
	}

	/**
	 * 功能：通过经纬度获取距离，单位：km，保留两位小数
	 *
	 * @param lat1
	 *            纬度1
	 * @param lng1
	 *            经度1
	 * @param lat2
	 *            纬度2
	 * @param lng2
	 *            经度2
	 * @return 计算结果
	 * @author heconggang
	 * @version 2018年10月22日 下午8:27:39
	 */
	public static double getDistance(double lat1, double lng1, double lat2, double lng2) {
		double radLat1 = rad(lat1);
		double radLat2 = rad(lat2);
		double a = radLat1 - radLat2;
		double b = rad(lng1) - rad(lng2);
		double s = 2 * Math.asin(Math.sqrt(
				Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
		s = s * EARTH_RADIUS;
		s = Math.round(s * 100d) / 100d;
		return s;
	}
	
	public static void main(String[] args) {
		double distance = getDistance(39.91488908d, 116.403887397d, 40.19d, 116.4d);
		System.out.println(distance);
	}
}