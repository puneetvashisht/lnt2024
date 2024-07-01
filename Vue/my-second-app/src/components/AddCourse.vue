<template>
    <h2>Add Course Component</h2>

    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Course Title</label>
        <input v-model="course.title" type="text" class="form-control" id="exampleFormControlInput1"
            placeholder="Type in a course title like Angular, React ..">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput2" class="form-label">Course Price</label>
        <input v-model="course.price" type="number" class="form-control" id="exampleFormControlInput2">
    </div>
    <button @click="addCourse()" class="btn btn-primary">Add Course</button>
</template>

<script>
export default {
    data() {
        return {
            course: {}
        }
    },
    methods: {
        addCourse() {
            console.log('Add a course', this.course);
            fetch('http://localhost:5000/courses', {
                method: 'POST',
                headers: {
                    'content-type': 'application/json'
                },
                body: JSON.stringify(this.course)
            })
            .then(res=> {console.log(res.status)})
        }
    }
}
</script>