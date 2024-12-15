package tk.therealsuji.vtopchennai.models;

public class VersionInfo {
    private String latest_version;
    private String min_supported_version;
    private String update_url;

    // Getters and setters

    public String getLatest_version() {
        return latest_version;
    }

    public void setLatest_version(String latest_version) {
        this.latest_version = latest_version;
    }

    public String getMin_supported_version() {
        return min_supported_version;
    }

    public void setMin_supported_version(String min_supported_version) {
        this.min_supported_version = min_supported_version;
    }

    public String getUpdate_url() {
        return update_url;
    }

    public void setUpdate_url(String update_url) {
        this.update_url = update_url;
    }
}