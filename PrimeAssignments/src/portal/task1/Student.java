package portal.task1;

public class Student {
	
		int rollNo;
		String name;
		String address;

		Student(int r, String n, String add) {
			rollNo = r;
			name = n;
			address = add;
		}

		@Override
		public String toString() {
			return rollNo + " " + name + " " + address;
		}

}
