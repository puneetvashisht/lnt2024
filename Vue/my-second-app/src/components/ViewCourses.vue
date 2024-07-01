<template>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Title</th>
                <th scope="col">Price</th>
                <th scope="col">Actions</th>
            </tr>
        </thead>
        <tbody>
            <tr v-for="course in courses">
                <th scope="row">{{ course.id }}</th>
                <td>{{ course.title }}</td>
                <td>{{ course.price }}</td>
                <td><button @click="deleteCourse(course.id)" class="btn btn-danger"> X </button></td>
            </tr>

        </tbody>
    </table>
</template>
<script>
export default {
    data: function () {
        return {
            courses: [
            { id: 2, title: "test", price: 344 }
        ]
        }
       
    },
    methods: {
        deleteCourse(courseId){
            fetch('http://localhost:5000/courses/'+ courseId,
                 {
                    method: 'DELETE'
                 }
            )
            .then(res => {
                console.log(res.status)
                var leftOverCourses = this.courses.filter(c => c.id!=courseId);
                this.courses = leftOverCourses
            })
        }
    },
    mounted() {
        console.log(`the component is now mounted.`)
        fetch('http://localhost:5000/courses')
            .then(res => res.json())
            .then(data => {
                console.log(data)
                this.courses = data
            })
    }
}

</script>