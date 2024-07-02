<template>

<div v-show="message" class="alert alert-success" role="alert">
   {{ message }}
</div>
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
                <td><button @click="deleteCourse(course.id)" class="btn btn-danger"> X </button> <button @click="navigate(course.id)" class="btn btn-primary"> View </button></td>
            </tr>

        </tbody>
    </table>
</template>
<script>
import axios from 'axios'
import CourseService from '../services/CourseService.js'
export default {
    data: function () {
        return {
            courses: []
        }
       
    },
    methods: {
        navigate(courseId){
            this.$router.push({ name: 'course', params: { id: courseId } })
        },
        deleteCourse(courseId){
            // axios.delete('http://localhost:3000/courses/'+ courseId)
            CourseService.deleteCourse(courseId)
            .then(res=> {
                console.log(res);
                console.log(res.status)
                this.message = "Course Deleted Successfully!"
                var leftOverCourses = this.courses.filter(c => c.id!=courseId);
                this.courses = leftOverCourses
            })
            // fetch('http://localhost:3000/courses/'+ courseId,
            //      {
            //         method: 'DELETE'
            //      }
            // )
            // .then(res => {
            //     console.log(res.status)
            //     this.message = "Course Deleted Successfully!"
            //     var leftOverCourses = this.courses.filter(c => c.id!=courseId);
            //     this.courses = leftOverCourses
            // })
        }
    },
    mounted() {
        console.log(`the component is now mounted.`)
        // fetch('http://localhost:3000/courses')
        //     .then(res => res.json())
        //     .then(data => {
        //         console.log(data)
        //         this.courses = data
        //     })
        // axios.get('http://localhost:3000/courses')
        // .then(res=> {
        //     console.log(res);
        //     this.courses = res.data
        // })
        CourseService.getCourses()
          .then(res=> {
            console.log(res);
            this.courses = res.data
        })
    }
}

</script>