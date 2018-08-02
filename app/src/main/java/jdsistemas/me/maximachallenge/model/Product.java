package jdsistemas.me.maximachallenge.model;

import com.orm.SugarRecord;

import org.parceler.Parcel;

/**
 * @author Jorge Danilo Gomes.
 *
 * Model Product.
 */
@Parcel
public class Product extends SugarRecord {

    private Long code;
    private String description;
    private String avatar;
    private String fornecedor;

    public Product() {
    }


    /**
     * Constructor responsable for new instance this Entity.
     *
     * @param code
     * @param description
     * @param avatar
     * @param fornecedor
     */
    public Product(Long code, String description, String avatar, String fornecedor) {
        this.code = code;
        this.description = description;
        this.avatar = avatar;
        this.fornecedor = fornecedor;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
