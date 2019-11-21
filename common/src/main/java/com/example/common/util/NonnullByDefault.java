package com.example.common.util;

import androidx.annotation.NonNull;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.TypeQualifierDefault;

/**
 * Annotation to alert of possible NullPointerExceptions. Also used for java code that should be
 * called from kotlin. It sets both return values and method parameters as not null by default.
 * <p>
 *
 * @see <a href="https://medium.com/square-corner-blog/non-null-is-the-default-58ffc0bb9111">https://medium.com/square-corner-blog/non-null-is-the-default-58ffc0bb9111</a>
 * @see <a href="https://stackoverflow.com/a/40091450">https://stackoverflow.com/a/40091450</a>
 * <p>
 * Created by azelikov on 9/21/17.
 */

@Documented
@NonNull
@TypeQualifierDefault({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface NonnullByDefault {
}
