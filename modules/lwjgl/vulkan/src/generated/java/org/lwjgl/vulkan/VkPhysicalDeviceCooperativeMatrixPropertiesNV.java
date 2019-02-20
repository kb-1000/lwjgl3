/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing cooperative matrix properties supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCooperativeMatrix#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code cooperativeMatrixSupportedStages} &ndash; a bitfield of {@code VkShaderStageFlagBits} describing the shader stages that cooperative matrix instructions are supported in. {@code cooperativeMatrixSupportedStages} will have the {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT} bit set if any of the physical device&#8217;s queues support {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceCooperativeMatrixPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkShaderStageFlags cooperativeMatrixSupportedStages;
 * }</code></pre>
 */
public class VkPhysicalDeviceCooperativeMatrixPropertiesNV extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEMATRIXSUPPORTEDSTAGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEMATRIXSUPPORTEDSTAGES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code cooperativeMatrixSupportedStages} field. */
    @NativeType("VkShaderStageFlags")
    public int cooperativeMatrixSupportedStages() { return ncooperativeMatrixSupportedStages(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV set(VkPhysicalDeviceCooperativeMatrixPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV create(long address) {
        return wrap(VkPhysicalDeviceCooperativeMatrixPropertiesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceCooperativeMatrixPropertiesNV.class, address);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCooperativeMatrixPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeMatrixPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #cooperativeMatrixSupportedStages}. */
    public static int ncooperativeMatrixSupportedStages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCooperativeMatrixPropertiesNV.COOPERATIVEMATRIXSUPPORTEDSTAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCooperativeMatrixPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeMatrixPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrixPropertiesNV, Buffer> {

        private static final VkPhysicalDeviceCooperativeMatrixPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrixPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceCooperativeMatrixPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeMatrixPropertiesNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeMatrixPropertiesNV.npNext(address()); }
        /** Returns the value of the {@code cooperativeMatrixSupportedStages} field. */
        @NativeType("VkShaderStageFlags")
        public int cooperativeMatrixSupportedStages() { return VkPhysicalDeviceCooperativeMatrixPropertiesNV.ncooperativeMatrixSupportedStages(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixPropertiesNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeMatrixPropertiesNV.npNext(address(), value); return this; }

    }

}