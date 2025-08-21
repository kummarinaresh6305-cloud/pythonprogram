public class Video {
        String VideoName;
        boolean checkout;
        int rating;
        public String getName()
        {
        	return VideoName;
        }
        public void doCheckout()
        {
        	checkout = true;
        }
        public void doReturn()
        {
        	checkout = false;
        }
        public void receiveRating(int rating)
        {
        	this.rating=rating;
        }
        public int getRating()
        {
        	return rating;
        }
        public boolean getCheckout()
        {
        	return checkout;
        }
        public Video(String name)
        {
        	VideoName = name;
        }       
}

