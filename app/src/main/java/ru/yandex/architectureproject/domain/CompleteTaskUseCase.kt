package ru.yandex.architectureproject.domain

import kotlinx.coroutines.delay
import kotlinx.coroutines.time.delay
import ru.yandex.architectureproject.data.repository.TaskRepository
import java.time.Duration

class CompleteTaskUseCase(
    private val repository: TaskRepository,
) {
    suspend operator fun invoke(taskId: Int) {
        repository.completeTask(taskId)
        delay(10_000)
        repository.deleteTask(taskId)
    }
}
