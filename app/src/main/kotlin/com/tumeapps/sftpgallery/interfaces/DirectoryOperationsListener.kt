package com.tumeapps.sftpgallery.interfaces

import com.tumeapps.sftpgallery.models.Directory
import java.io.File

interface DirectoryOperationsListener {
    fun refreshItems()

    fun deleteFolders(folders: ArrayList<File>)

    fun recheckPinnedFolders()

    fun updateDirectories(directories: ArrayList<Directory>)
}
