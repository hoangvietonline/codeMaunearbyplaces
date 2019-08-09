package hoangviet.ndhv.aplicationgooglemapnearbyplaces;

import hoangviet.ndhv.aplicationgooglemapnearbyplaces.Remove.IGoogleAPIService;
import hoangviet.ndhv.aplicationgooglemapnearbyplaces.Remove.RetrofitClient;
import retrofit2.Retrofit;

public class Common {
    private static String GOOGLE_API_URL = "https://maps.googleapis.com/";
    public static IGoogleAPIService getGoogleAPIService(){
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
