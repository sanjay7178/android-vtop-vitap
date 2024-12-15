package tk.therealsuji.vtopchennai.interfaces;
import tk.therealsuji.vtopchennai.models.VersionInfo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface VersionApiService {
    @GET("surya-d-naidu/android-vtop-vitap/refs/heads/master/version.json")
    Call<VersionInfo> getVersionInfo();
}
