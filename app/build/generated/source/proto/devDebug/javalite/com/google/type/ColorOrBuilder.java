// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/color.proto

package com.google.type;

public interface ColorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.type.Color)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The amount of red in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>optional float red = 1;</code>
   */
  float getRed();

  /**
   * <pre>
   * The amount of green in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>optional float green = 2;</code>
   */
  float getGreen();

  /**
   * <pre>
   * The amount of blue in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>optional float blue = 3;</code>
   */
  float getBlue();

  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *   pixel color = alpha * (this color) + (1.0 - alpha) * (background color)
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is to be rendered as a solid color
   * (as if the alpha value had been explicitly given with a value of 1.0).
   * </pre>
   *
   * <code>optional .google.protobuf.FloatValue alpha = 4;</code>
   */
  boolean hasAlpha();
  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *   pixel color = alpha * (this color) + (1.0 - alpha) * (background color)
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is to be rendered as a solid color
   * (as if the alpha value had been explicitly given with a value of 1.0).
   * </pre>
   *
   * <code>optional .google.protobuf.FloatValue alpha = 4;</code>
   */
  com.google.protobuf.FloatValue getAlpha();
}
