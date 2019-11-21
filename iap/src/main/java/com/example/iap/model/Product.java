package com.example.iap.model;

import java.util.List;
import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Equivilent of the kotlin version of the same class.  Used for easy switching between languages
 *
 * To switch to kotlin, comment out this file, and uncomment Product.kt
 */
public final class Product {
    @NonNull
    private final String productId;
    @NonNull
    private final List skus;

    @NonNull
    public final String getProductId() {
        return this.productId;
    }

    @NonNull
    public final List getSkus() {
        return this.skus;
    }

    public Product(@NonNull String productId, @NonNull List skus) {
        super();
        this.productId = productId;
        this.skus = skus;
    }

    @NonNull
    public final String component1() {
        return this.productId;
    }

    @NonNull
    public final List component2() {
        return this.skus;
    }

    @NonNull
    public final Product copy(@NonNull String productId, @NonNull List skus) {
        return new Product(productId, skus);
    }

    // $FF: synthetic method
    public static Product copy$default(Product var0, String var1, List var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.productId;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.skus;
        }

        return var0.copy(var1, var2);
    }

    @NonNull
    public String toString() {
        return "Product(productId=" + this.productId + ", skus=" + this.skus + ")";
    }

    public int hashCode() {
        String var10000 = this.productId;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        List var10001 = this.skus;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Product) {
                Product var2 = (Product)var1;
                if (Objects.equals(this.productId, var2.productId) && Objects.equals(this.skus, var2.skus)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
