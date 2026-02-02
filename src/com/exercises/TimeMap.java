package com.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeMap {

	private HashMap<String, List<TimestampValue>> map = new HashMap<>();

	public TimeMap() {

	}

	public void set(String key, String value, int timestamp) {
		var list = map.get(key);
		if (list == null) {
			list = new ArrayList<>();
		}
		list.add(new TimestampValue(value, timestamp));
		map.put(key, list);
	}

	public String get(String key, int timestamp) {
		var list = map.get(key);
		if (list == null) {
			return "";
		}
		if (list.size() == 1) {
			int x = getCloserToValue(0, -1, list, timestamp);
			if (x == -1) {
				return "";
			}
			return list.get(0).value;
		}
		if (list.size() == 2) {
			int x = getCloserToValue(0, 1, list, timestamp);
			if (x == -1) {
				return "";
			}
			return list.get(x).value;
		}

		int left = 0;
		int middle = list.size() / 2;
		int right = list.size() - 1;
		int closest = -1;
		while (true) {
			closest = getCloserToValue(left, closest, list, timestamp);
			closest = getCloserToValue(middle, closest, list, timestamp);
			closest = getCloserToValue(right, closest, list, timestamp);

			if (closest == -1) {
				return "";
			}

			if (list.get(closest).timestamp == timestamp) {
				return list.get(closest).value;
			}

			if (left == middle || right == middle) {
				return list.get(closest).value;
			}

			if (list.get(middle).timestamp < timestamp) {
				left = middle;
			} else {
				right = middle;
			}

			middle = (right - left) / 2 + left;
		}
	}

	private int getCloserToValue(int num1, int num2, List<TimestampValue> list, int value) {
		if (num2 == -1 || list.get(num2).timestamp > value) {
			return list.get(num1).timestamp <= value ? num1 : -1;
		}
		if (list.get(num1).timestamp > value) {
			return list.get(num2).timestamp <= value ? num2 : -1;
		}

		return Math.abs(value - list.get(num1).timestamp) >= Math.abs(value - list.get(num2).timestamp) ? num2 : num1;
	}

	class TimestampValue {
		String value;
		int timestamp;

		public TimestampValue(TimestampValue timestampValue) {
			this.value = timestampValue.value;
			this.timestamp = timestampValue.timestamp;
		}

		public TimestampValue(String value, int timestamp) {
			this.timestamp = timestamp;
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public int getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(int timestamp) {
			this.timestamp = timestamp;
		}
	}
}
