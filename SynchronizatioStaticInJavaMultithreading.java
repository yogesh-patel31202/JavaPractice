
public class SynchronizatioStaticInJavaMultithreading {
		
		//Static Synchronization is class level lock (Multiple object Create)

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			BookTheaterSeatStatic bs = new BookTheaterSeatStatic();
			MyThread1 m1 = new MyThread1(bs, 6);
			m1.start();

			MyThread2 m2 = new MyThread2(bs, 7);
			m2.start();

			BookTheaterSeatStatic bs1 = new BookTheaterSeatStatic();

			MyThread1 m3 = new MyThread1(bs1, 6);
			m3.start();

			MyThread2 m4 = new MyThread2(bs1, 7);
			m4.start();

		}

	}

	class BookTheaterSeatStatic {

		static int total_seat = 20;

		synchronized static void bookSeat(int seats) {

			if (total_seat >= seats) {

				System.out.println(seats + "seats booked sucessfully");

				total_seat = total_seat - seats;

				System.out.println("seats Left" + total_seat);

			} else {
				System.out.println("sorry seats cannot be booked");
				System.out.println("seats Left" + total_seat);
			}

		}

	}

	class MyThread1 extends Thread {

		BookTheaterSeatStatic bs;

		int seats;

		MyThread1(BookTheaterSeatStatic bs, int seats) {

			this.bs = bs;
			this.seats = seats;

		}

		public void run() {

			bs.bookSeat(seats);

		}

	}

	class MyThread2 extends Thread {

		BookTheaterSeatStatic bs;

		int seats;

		MyThread2(BookTheaterSeatStatic bs, int seats) {

			this.bs = bs;
			this.seats = seats;

		}

		public void run() {

			bs.bookSeat(seats);

		}

}
