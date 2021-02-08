package movie_review_service;
import java.util.HashMap;
import java.util.Map;

public class Review {
	
	String username;
	Roles user_role;
	String movie_name;
	double review_score;
	
	public Review(String username, Roles user_role, String movie_name, double review_score)
	{
		this.username = username;
		this.user_role = user_role;
		this.movie_name = movie_name;
		this.review_score = review_score;
	}
	
	public Map<String, String> get_Username_Movie()
	{
		Map<String, String> result = new HashMap<>();
		result.put("username", this.username);
		result.put("movie_name", this.movie_name);
		return result;
	}

}
