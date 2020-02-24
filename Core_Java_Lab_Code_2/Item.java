package Core_Java_Lab_Code_2;

public abstract class Item {
		private int id;
		private String title;
		private int noOfCopies;
		
		@Override
		public String toString() {
			return "Item [id=" + id + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Item other = (Item) obj;
				if (id != other.id)
					return false;
				if (noOfCopies != other.noOfCopies)
					return false;
				if (title == null) {
					if (other.title != null)
						return false;
				} else if (!title.equals(other.title))
					return false;
				return true;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public int getNoOfCopies() {
				return noOfCopies;
			}

			public void setNoOfCopies(int noOfCopies) {
				this.noOfCopies = noOfCopies;
			}
			
			public abstract void checkIn();
			public abstract void checkOut();
			public abstract void addItem();
	}



