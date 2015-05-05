package contactorganizer.intracode.org.contactmanager;

import android.net.Uri;

/**
 * Created by ihsan_taha on 4/18/15.
 */
public class Contact {

    private String _name, _phone, _email, _address;
    private Uri _imageURI;
    private int _id;

    public Contact () {

    }

    public Contact(int id, String name, String phone, String email, String address, Uri imageURI) {
        _id = id;
        _name = name;
        _phone = phone;
        _email = email;
        _address = address;
        _imageURI = imageURI;
    }

    //public void setID(int id) { this._id = id; }

    public int getId() { return this._id; }

    //public void setName(String name) { this._name = name; }

    public String getName() {
        return this._name;
    }

    //public void setPhone(String phone) { this._phone = phone; }

    public String getPhone() {
        return this._phone;
    }

    //public void setEmail(String email) { this._email = email; }

    public String getEmail() {
        return this._email;
    }

    //public void setAddress(String address) { this._address = address; }

    public String getAddress() { return this._address; }

   //public void setImageUri(Uri uriPic) { this._imageURI = uriPic; }

    public Uri get_imageURI() { return this._imageURI; }

}
