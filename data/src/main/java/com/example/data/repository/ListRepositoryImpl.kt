package com.example.data.repository

import com.example.domain.data.entity.ListButton
import com.example.domain.data.entity.ListElement
import com.example.domain.data.repository.ListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class ListRepositoryImpl : ListRepository {
    override suspend fun getList(): List<ListElement> = withContext(Dispatchers.IO) {
        delay(5_000)
        return@withContext listOf(
            ListElement(
                id = 0,
                image = "https://vetacademy.ru/img-content/20191512-1.jpg",
                title = "С наступающим!",
                subtitle = "test",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 1,
                image = "https://alterlit.ru/media/post_images/51af0bc690fb4ad2beb51550104cae88.jpg",
                title = "Волшебства!",
                subtitle = "test",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 2,
                image = "https://vetmshk.nso.ru/sites/vetmshk.nso.ru/wodby_files/files/news/2023/12/christaa.jpg",
                title = "Чудес!",
                subtitle = "test",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 3,
                image = "https://i.pinimg.com/736x/b8/cf/a5/b8cfa5027be3b01af9a7a7695e281093.jpg",
                title = "С Новым годом!",
                subtitle = "test",
                button = ListButton(
                    title = "test"
                )
            )
        )
    }

    override suspend fun getElement(id: Long): ListElement {
        return ListElement(
            id = 0,
            image = "https://i.pinimg.com/736x/b6/88/21/b68821fcc059280e26a2a9c5a799f394.jpg",
            title = "с Рождеством!",
            subtitle = "test",
            button = ListButton(
                title = "test"
            )
        )
    }
}