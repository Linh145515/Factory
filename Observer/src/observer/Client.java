package observer;

public class Client {
	
	    public static void main(String[] args) {

	        Connection user = new Connection();

	        SocialMediaFeed feed1 = new SocialMediaFeed();
	        SocialMediaFeed feed2 = new SocialMediaFeed();

	        // đăng ký observer
	        user.add(feed1);
	        user.add(feed2);

	        // cập nhật status
	        user.setStatus("Hello world!");
	        user.setStatus("Observer Pattern is cool!");

	        // hiển thị feed
	        feed1.showFeed();
	        System.out.println("------");
	        feed2.showFeed();
	    }
	}