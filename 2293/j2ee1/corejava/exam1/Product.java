package j2ee1.corejava.exam1;

public class Product {

		private int productId;
		private String productName;
		private double price;

		public Product( ) {
			super();
			productId = 0;
			productName = "";
			price = 0;
		}

		

		//Method overload constructor

		public Product(int productId, String productName, double price) {

			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
		}

		
		public int getProductId() {
			return productId;
		}



		public void setProductId(int productId) {
			this.productId = productId;
		}



		public String getProductName() {
			return productName;
		}



		public void setProductName(String productName) {
			this.productName = productName;
		}



		public double getPrice() {
			return price;
		}



		public void setPrice(double price) {
			this.price = price;
		}



		@Override

		public int hashCode() {

			final int prime = 31;

			int result = 1;

			result = prime * result + productId;

			return result;

		}

		@Override

		public boolean equals(Object obj) {

			if (this == obj)

				return true;

			if (obj == null)

				return false;

			if (getClass() != obj.getClass())

				return false;

			Product other = (Product) obj;

			if (productId != other.productId)

				return false;

			return true;

		}

		@Override
		public String toString() {

			return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + price + "]";

		}
}
