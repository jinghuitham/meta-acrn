require recipes-sato/images/core-image-sato.bb

CORE_IMAGE_EXTRA_INSTALL_append = " \
    packagegroup-acrn \
    linux-firmware \
    kernel-modules \
"

inherit image-acrn
