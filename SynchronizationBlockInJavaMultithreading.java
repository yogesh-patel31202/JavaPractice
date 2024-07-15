
public class SynchronizationBlockInJavaMultithreading extends Thread {

		static BookTheaterSeat1 th;
		int seats;

		public void run() {

			th.bookSeat(seats);

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			th = new BookTheaterSeat1();
			SynchronizationBlockInJavaMultithreading suraj = new SynchronizationBlockInJavaMultithreading();// Object
																											// unique
																											// lock
			suraj.seats = 7;
			suraj.start();
			SynchronizationBlockInJavaMultithreading raj = new SynchronizationBlockInJavaMultithreading();
			raj.seats = 6;
			raj.start();

		}

	}

	class BookTheaterSeat1 {

		int total_seat = 10;

		 void bookSeat(int seats) {

			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName());

			synchronized (this) { // object reference, and reduce waiting time

				if (total_seat >= seats) {

					System.out.println(seats + "seats booked sucessfully");

					total_seat = total_seat - seats;

					System.out.println("seats Left" + total_seat);

				} else {
					System.out.println("sorry seats cannot be booked");
					System.out.println("seats Left" + total_seat);
				}

				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getName());

			}

		}

}
