
public class SynchronizationMethodInJavaMultithreading  extends Thread{



		static BookTheaterSeat th;
		int seats;

		public void run() {

			th.bookSeat(seats);

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			th = new BookTheaterSeat();
			
			SynchronizationMethodInJavaMultithreading suraj = new SynchronizationMethodInJavaMultithreading();// Object
																									// unique
																									// lock
			suraj.seats = 7;
			suraj.start();
			
			
			SynchronizationMethodInJavaMultithreading raj = new SynchronizationMethodInJavaMultithreading();
			
			
			raj.seats = 6;
			raj.start();

		}

	}

	class BookTheaterSeat {

		int total_seat = 10;

		synchronized void bookSeat(int seats) {

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


